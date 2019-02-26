DROP TABLE IF EXISTS foods;
CREATE TABLE foods (
  id serial PRIMARY KEY,
  name VARCHAR(100),
  calories integer,
  fat integer,
  protein integer,
  carbs integer)
