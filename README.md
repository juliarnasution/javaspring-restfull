#API Spec

##Create Product
Request :
 - method : POST
 - Endpoint : `/api/products`
 - Header : 
    - Content-Type : application/json
    - Accept : application/json
 - Body : 
 ```json
    {
        "name": "string",
        "price": "long",
        "quantity": "integer"  
    }
```

Response :
```json
    {
      "code": "number",
      "status": "boolean",
      "message": "string",
      "data": {
          "id_product": "string, uuid",
          "name": "string",
          "price": "long",
          "quantity": "integer",
          "createdAt": "date"
      }
    }
```
##Get Product
Request :
 - method : GET
 - Endpoint : `/api/products/{id_product}`
 - Header : 
    - Accept : application/json

Response :
```json
{
    "code": "number",
    "status": "boolean",
    "message": "string",
    "data": {
        "id_product": "string, uuid",
        "name": "string",
        "price": "long",
        "quantity": "integer",
        "createdAt": "date",
        "updatedAt": "date"
    }
}
```
##Update Product
Request :
 - method : PUT
 - Endpoint : `/api/products/{id_product}`
 - Header : 
    - Content-Type : application/json
    - Accept : application/json
 - Body : 
 ```json
    {
      "name": "string",
      "price": "long",
      "quantity": "integer"
    }
```

Response :
```json
{
  "code": "number",
  "status": "boolean",
  "message": "string",
  "data": {
      "id_product": "string, uuid",
      "name": "string",
      "price": "long",
      "quantity": "integer",
      "createdAt": "date",
      "updatedAt": "date"
  }
}
```
##List Product
Request :
 - method : GET
 - Endpoint : `/api/products`
 - Header : 
    - Accept : application/json
 - Query Param
    - size : number,
    - page : number, 
    
Response :
```json
{
    "code": "number",
    "status": "boolean",
    "message": "string",
    "data": [
      {
        "id_product": "string, uuid",
        "name": "string",
        "price": "long",
        "quantity": "integer",
        "createdAt": "date",
        "updatedAt": "date"
      },
      {
        "id_product": "string, uuid",
        "name": "string",
        "price": "long",
        "quantity": "integer",
        "createdAt": "date",
        "updatedAt": "date"
      }
    ]
}
```
##Delete Product
Request :
 - method : DELETE
 - Endpoint : `/api/product/{id_product}`
 - Header : 
    - Accept : application/json

Response :
```json
{
  "code": "number",
  "status": "boolean",
  "message": "string"
}
```