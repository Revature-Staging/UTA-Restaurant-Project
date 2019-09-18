CREATE TABLE Job_Roles (
	role_id INT PRIMARY KEY,
	job_role varchar(10) NOT NULL
);

CREATE TABLE Employees (
	employee_id INT PRIMARY KEY,
	firstname varchar(50) NOT NULL,
	lastname varchar(50) NOT NULL,
	job_role_id INT,
	FOREIGN KEY (job_role_id) REFERENCES Job_Roles(role_id)
);

CREATE TABLE Restaurants (
	restaurant_id INT PRIMARY KEY,
	restaurant_name varchar(25) NOT NULL,
	street_address varchar(100) NOT NULL,
	zip_code INT NOT NULL,
	feedback_score DOUBLE(2,1),
	CONSTRAINT CHK_Score CHECK (feedback_score>=0 AND feedback_score<=5)
);

CREATE TABLE Restaurant_Employees (
	employee_id INT UNIQUE,
	restaurant_id INT,
	FOREIGN KEY (employee_id) REFERENCES Employees(employee_id),
	FOREIGN KEY (restaurant_id) REFERENCES Restaurants(restaurant_id)
);

CREATE TABLE Restaurant_Managers (
	employee_id INT,
	restaurant_id INT UNIQUE,
	FOREIGN KEY (employee_id) REFERENCES Employees(employee_id),
	FOREIGN KEY (restaurant_id) REFERENCES Restaurants(restaurant_id)
);

CREATE TABLE Menu_Items (
	item_id INT PRIMARY KEY,
	item_name varchar(20) UNIQUE NOT NULL,
	price DOUBLE(4,2) NOT NULL,
	description varchar(50),
	image BLOB, 
	supply INT NOT NULL
);

CREATE TABLE Restaurant_Menu_Items (
	restaurant_id INT,
	menu_item_id INT,
	FOREIGN KEY (restaurant_id) REFERENCES Restaurants(restaurant_id),
	FOREIGN KEY (menu_item_id) REFERENCES Menu_Items(item_id)
);

CREATE TABLE Restaurant_Users (
	customer_id INT PRIMARY KEY,
	user_name varchar(10) NOT NULL UNIQUE,
	firstname varchar(50) NOT NULL,
	lastname varchar(50) NOT NULL,
	email varchar(40) NOT NULL UNIQUE,
	password varchar(15) NOT NULL,
	rewards DOUBLE(6,2),
	total_spent DOUBLE(6,2)
);

CREATE TABLE Orders (
	order_id INT PRIMARY KEY AUTO_INCREMENT,
	customer_id INT,
	order_date DATETIME NOT NULL,
	restaurant_id INT,
	FOREIGN KEY (customer_id) REFERENCES Restaurant_Users(customer_id),
	FOREIGN KEY (restaurant_id) REFERENCES Restaurants(restaurant_id)
);

CREATE TABLE Order_Details (
	order_details_id INT PRIMARY KEY AUTO_INCREMENT,
	order_id INT,
	order_total DOUBLE(6,2) NOT NULL,
	items_ordered BLOB NOT NULL,
	FOREIGN KEY (order_id) REFERENCES Orders(order_id)
);
	
