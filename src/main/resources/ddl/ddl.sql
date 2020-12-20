create table app_config
(
    config_code text not null
        constraint app_config_pk
            primary key,
    config_class text,
    config_value text
);

-- 工具配置列表
create table app_tool_list
(
    id text not null
        constraint app_tool_list_pk
            primary key,
    tool_name text,
    tool_view_class text,
    tool_open_modality int,
    order_id int
);

create table data_export_config
(
    id int not null
        constraint data_export_config_pk
            primary key,
    query_statement text not null,
    class_name text not null,
    remark text
);

create table data_source_config
(
    ip text not null,
    data_name text not null,
    port text not null,
    user_name text not null,
    password text not null,
    remark text,
    smcenter_ip text,
    primary key (ip, data_name)
);

create table gitlab_milestone
(
    id integer not null
        constraint gitlab_milestone_pk
            primary key,
    name text
);

create table gitlab_milestone_xhs
(
    id integer
        constraint gitlab_milestone_xhs_pk
            primary key,
    title text,
    project_id integer,
    project_name text
);

create table gitlab_project_config
(
    project_name text,
    project_id text
);

create table log_file_list
(
    id integer
        constraint log_file_list_pk
            primary key autoincrement,
    name text,
    log_file_path text,
    sys_project_id text,
    sys_server_id integer,
    sys_env_id integer
);

create table sys_db
(
    id integer
        constraint sys_db_pk
            primary key autoincrement,
    name text,
    ip text,
    port int,
    username text,
    password text
);

create table sys_db_name
(
    id integer
        constraint sys_db_name_pk
            primary key autoincrement,
    name text
);

create table sys_env
(
    id integer
        constraint sys_env_pk
            primary key autoincrement,
    name text
);

create table sys_project
(
    id integer
        constraint sys_project_pk
            primary key autoincrement,
    name text
);

create table sys_server
(
    id integer
        constraint sys_server_pk
            primary key autoincrement,
    name text,
    ip text,
    port text,
    username text,
    password text
);

