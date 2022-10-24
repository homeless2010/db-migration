--liquibase formatted sql

--changeset zhouyi:1
-- 创建用户表
alter table dh_project_category add column bbb varchar(255);