# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table events (
  title                         varchar(255) not null,
  venue                         varchar(255),
  votes                         integer,
  constraint pk_events primary key (title)
);


# --- !Downs

drop table if exists events;

