# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table playdb.public.cancion (
  c_id                          bigint,
  d_nombre                      varchar(255)
);

create table playdb.public.usuario (
  c_id                          serial not null,
  d_nombre                      varchar(255),
  constraint pk_usuario primary key (c_id)
);


# --- !Downs

drop table if exists playdb.public.cancion cascade;

drop table if exists playdb.public.usuario cascade;

