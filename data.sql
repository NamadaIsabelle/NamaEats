-- Sample Users
INSERT INTO users (username, email, password, role)
VALUES ('Isabela', 'isa@example.com', '1234', 'CUSTOMER');

INSERT INTO users (username, email, password, role)
VALUES ('Alice', 'alice@example.com', 'pass123', 'CUSTOMER');

INSERT INTO users (username, email, password, role)
VALUES ('Admin', 'admin@namaeats.com', 'admin123', 'ADMIN');

-- Sample Menu Items
INSERT INTO menu_item (name, category, price, description)
VALUES ('Burger', 'Lunch', 350.0, 'Juicy beef burger with cheese');

INSERT INTO menu_item (name, category, price, description)
VALUES ('Pizza', 'Dinner', 750.0, 'Cheesy pizza with tomato sauce');

INSERT INTO menu_item (name, category, price, description)
VALUES ('Soda', 'Drink', 100.0, 'Refreshing soft drink');

-- Sample Orders (linked to users by user_id)
INSERT INTO orders (order_time, total_amount, items, user_id)
VALUES (NOW(), 450.0, 'Burger, Soda', 1);

INSERT INTO orders (order_time, total_amount, items, user_id)
VALUES (NOW(), 750.0, 'Pizza, Soda', 2);
