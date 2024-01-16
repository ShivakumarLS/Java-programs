class ValidRequest:
    @staticmethod
    def isValidToken(tokens, token):
        return token in tokens

    @staticmethod
    def getResponses(valid_tokens, requests):
        result = []
        for request in requests:
            if "token=" not in request[1] or (request[0] == "POST" and "csrf" not in request[1]):
                result.append("INVALID")
                continue

            token = request[1].split("token=")[1].split("&")[0]
            if ValidRequest.isValidToken(valid_tokens, token):
                name = request[1].split("&name=")[1]
                id_val = request[1].split("id=")[1].split("&")[0]

                if request[0] == "POST":
                    csrf = request[1].split("csrf=")[1].split("&")[0]
                    result.append(f"VALID,id,{id_val},token,{token},name,{name},csrf,{csrf}")
                else:
                    result.append(f"VALID,id,{id_val},token,{token},name,{name}")

        return result


if __name__ == "__main__":
    request1 = "http://example.com/api/data?token=token9&id=123&name=alex"
    request2 = "http://example.com/api/data?token=token2&id=123&csrf=asdf&name=alex"
    request3 = "http://example.com/api/data?id=456"
    valid_tokens = ["token1", "token2"]
    requests = [["POST", request1],["POST", request2],["GET", request3]]

    responses = ValidRequest.getResponses(valid_tokens, requests)
    print("\n".join(responses))
    # for response in responses:
    #     print(response)
