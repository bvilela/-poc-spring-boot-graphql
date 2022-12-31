# PoC Spring Boot and GraphQL
PoC Spring Boot and GraphQL

### URLs
- [Console H2](http://localhost:8080/h2-console)
- [Console GraphQL](http://localhost:8080/graphiql?path=/graphql)

### Technologies
- Maven
- Java 11
- Lombok
- Spring Boot 3.0.1
- H2 DataBase
- Spring GraphQL

### Examples
```
curl --request POST \
  --url http://localhost:8080/graphql \
  --header 'Accept-Language: pt-BR,pt;q=0.9,en-US;q=0.8,en;q=0.7' \
  --header 'Cache-Control: no-cache' \
  --header 'Connection: keep-alive' \
  --header 'Origin: http://localhost:8080' \
  --header 'Pragma: no-cache' \
  --header 'Referer: http://localhost:8080/graphiql?path=/graphql' \
  --header 'Sec-Fetch-Dest: empty' \
  --header 'Sec-Fetch-Mode: cors' \
  --header 'Sec-Fetch-Site: same-origin' \
  --header 'User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36 OPR/94.0.0.0' \
  --header 'accept: application/json, multipart/mixed' \
  --header 'content-type: application/json' \
  --header 'sec-ch-ua: "Chromium";v="108", "Opera";v="94", "Not)A;Brand";v="99"' \
  --header 'sec-ch-ua-mobile: ?0' \
  --header 'sec-ch-ua-platform: "Windows"' \
  --data '{"query":"query {\n  allCities {\n    id\n    name\n    size\n    state {\n      id\n      abbreviation\n      fullName\n    }\n  }\n}"}'
```
![example01](images/example01.png)