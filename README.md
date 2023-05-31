# Food Delivery

This is the food delivery API project which give authentication service to user and give functionality to user to see food item lists and to order them Also we have admin access to add and remove restro and foods. 
## Framework and language used
* SprigBoot framework 
* Java
* MySql

## Data flow

### Controller 
@GetMapping , @Postmaping , @RequestMapping, @DeleteMapping, @PutMapping

### Service 
* AuthenticationService
save , getToken

* OrderService
createOrder , getOrderById  , getOrder

* UserService
sign , signup

* Food Menu service
getAllFood , getFoodById , addFood.

## Data Structure
* MySql database

## Summary
* This project is connected with MySql database in which we have all data stored about user , foodItmes and admin And we are processing this data using our API call.
