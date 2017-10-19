# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table usuario (
  c_id                          serial not null,
  d_nombre                      varchar(255),
  constraint pk_usuario primary key (c_id)
);

create table cancion (
  c_id                          serial not null,
  d_nombre                      varchar(255),
  d_uri                         varchar(255),
  c_id_usuario                  integer not null,
  constraint pk_cancion primary key (c_id)
);

alter table cancion add constraint fk_cancion_c_id_usuario foreign key (c_id_usuario) references usuario (c_id) on delete restrict on update restrict;
create index ix_cancion_c_id_usuario on cancion (c_id_usuario);


# --- !Downs

alter table if exists cancion drop constraint if exists fk_cancion_c_id_usuario;
drop index if exists ix_cancion_c_id_usuario;

drop table if exists cancion cascade;

drop table if exists usuario cascade;

