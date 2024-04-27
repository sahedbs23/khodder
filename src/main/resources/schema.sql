CREATE TYPE public."product_attribute_type" AS ENUM (
  'color',
  'size'
);

CREATE TABLE public."categories" (
  "id" bigserial PRIMARY KEY,
  "name" varchar(55) NOT NULL ,
  "description" varchar(255),
  "created_at" timestamp DEFAULT now(),
  "deleted_at" timestamp
);

CREATE TABLE public."sub_categories" (
  "id" bigserial PRIMARY KEY,
  "category_id" bigserial,
  "name" varchar(55) NOT NULL ,
  "description" varchar(255),
  "created_at" timestamp DEFAULT now(),
  "deleted_at" timestamp
);


ALTER TABLE public.sub_categories 
ADD CONSTRAINT fk_categories_sub_categories FOREIGN KEY (category_id)
REFERENCES public.categories(id);


CREATE TABLE public."products" (
  "product_id" bigserial PRIMARY KEY,
  "name" varchar(255) not null,
  "description" text,
  "avg_rating" NUMERIC(2,1) CHECK (avg_rating >= 1 AND avg_rating <= 5) default 5.0,
  "rat_count" integer default 1,
  "vendor_id" bigserial not null,
  "created_at" timestamp DEFAULT now(),
  "deleted_at" timestamp
);

CREATE TABLE public."product_attributes" (
  "id" integer PRIMARY KEY,
  "type" product_attribute_type,
  "value" varchar(55) not null,
  "created_at" timestamp default now(),
  "deleted_at" timestamp
);

CREATE TABLE public."products_skus" (
  "sku_id" bigserial PRIMARY KEY,
  "product_id" bigserial not null,
  "size_attribute_id" integer,
  "color_attribute_id" integer,
  "sku" varchar(55) not null,
  "price" NUMERIC(10,2) not null default 0.0,
  "quantity" integer,
  "created_at" timestamp default now(),
  "deleted_at" timestamp
);

ALTER TABLE public.products_skus 
ADD CONSTRAINT fk_products_products_skus FOREIGN KEY (product_id)
REFERENCES public.products_skus(sku_id);

