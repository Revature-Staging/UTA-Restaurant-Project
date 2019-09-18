# Java Full Stack Staging Project

## UTA-Restaurant-Project
+ Full stack project for UTA-staging.
+ Create an application for a local restaurant chain

## Technologies

+ Angular / React.js w/wo Bootstrap
+ Spring-Boot, Spring
+ Microservices: Messaging, Circuit Breaker, Gateway, Discovery Service
+ Database: RDS, H2 etc

## User Stories


### Managers/Employees
 
+ Managers can have one or more locations they manage
+ Managers can change locations of Employees
+ Managers can create/remove menu items
+ Managers can add/remove Employees
+ Managers can assign roles to Employees


+ Employees/Managers can see pending/completed orders
+ Employees/Managers can add/remove stock from location
+ Employees/Managers can see the feedback score of the location
+ Employees can see their managers

### Menu

+ Each restaurant has main menu items and unique items for that location
+ Menu should have 5 or more items
+ A checkout cart is created, items can be added and removed
+ An order must have at least one menu item
+ Stock of product decreases per item


### Users

+ Users can order food as a guest or create an account
+ Users can add/remove food from order
+ Users can choose which location to get food delivered too/from
+ Users can choose to pick up/get delivered food


### Webpage

+ Contact page with feedback form for user experience
+ There should be a link to another stores menu/page


### Extra 

+ Users join a rewards program when they create an account and get sent a welcome email
+ Users get 10 reward dollars points for every 20 dollars they spend
+ Users can use the rewards points at checkout
+ Users enter a tier for every 500/1000/1500 reward dollars they accrue and get discount coupons at random for 10%, 20%, or 35% off total order.

+ Employee Roles: Customer Service can respond to customer feedback
+ Employee Roles: Stocker enters items that are in stock
+ Employee Roles: Cashier/Cook/Custodial can log in and see their hours but have no additional features
