--Daniela
CREATE TABLE IF NOT EXISTS career_coordinator
(
    id               SERIAL,
    phone_number     VARCHAR(15),
    coordinator_name VARCHAR(100),
    PRIMARY KEY (id)
);
--Elkin
CREATE TABLE IF NOT EXISTS career
(
    id             SERIAL,
    career_name    VARCHAR(100),
    coordinator_id INT,
    UNIQUE (coordinator_id),
    PRIMARY KEY (id),
    FOREIGN KEY (coordinator_id) REFERENCES career_coordinator (id)
);

--Lucho
CREATE TABLE IF NOT EXISTS student
(
    id        SERIAL,
    full_name VARCHAR(100) NOT NULL,
    nui       VARCHAR(15)  NOT NULL,
    photo_url TEXT,
    career_id INT,
    UNIQUE (nui),
    PRIMARY KEY (id),
    CONSTRAINT fk_career FOREIGN KEY (career_id) REFERENCES career (id)
);
-- Fernando
CREATE TABLE IF NOT EXISTS company
(
    id           SERIAL,
    company_name VARCHAR(150) NOT NULL,
    ceo          VARCHAR(200) NOT NULL,
    address      TEXT,
    province     VARCHAR(100),
    latitude     DECIMAL(10, 8),
    longitude    DECIMAL(11, 8),
    canton       VARCHAR(100),
    PRIMARY KEY (id)
);
--Fernando
CREATE TABLE IF NOT EXISTS academic_tutor
(
    id         SERIAL,
    tutor_name VARCHAR(150),
    career_id  INT,
    PRIMARY KEY (id),
    FOREIGN KEY (career_id) REFERENCES career (id)
);
--Fernando
CREATE TABLE IF NOT EXISTS company_tutor
(
    id         SERIAL,
    full_name  VARCHAR(150),
    phone      VARCHAR(100),
    company_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (company_id) REFERENCES company (id)
);
--Elkin
CREATE TABLE IF NOT EXISTS practice
(
    id                SERIAL,
    start_date        DATE NOT NULL,
    end_date          DATE NOT NULL,
    office            VARCHAR(100),
    level             VARCHAR(50),
    academic_period   VARCHAR(50),
    PRIMARY KEY (id),
    company_tutor_id  INT REFERENCES company_tutor (id),
    student_id        INT REFERENCES student (id),
    tutor_academic_id INT REFERENCES academic_tutor (id)
);

--Wilson
CREATE TABLE IF NOT EXISTS activity
(
    id             SERIAL,
    description    VARCHAR(250) NOT NULL,
    entrance_hour  DATE         NOT NULL,
    departure_date DATE         NOT NULL,
    total_hours    DECIMAL(5,2) NOT NULL,
    resources      VARCHAR(250) NOT NULL,
    observations   VARCHAR(250) NOT NULL,
    practice_id    INT          NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (practice_id) REFERENCES practice (id)
);


--Elkin
CREATE TABLE IF NOT EXISTS eval
(
    id                SERIAL,
    description       VARCHAR(200),
    grade             DECIMAL(5, 2),
    student_id        INT,
    company_tutor_id  INT,
    tutor_academic_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (student_id) REFERENCES student (id),
    FOREIGN KEY (company_tutor_id) REFERENCES company_tutor (id),
    FOREIGN KEY (tutor_academic_id) REFERENCES academic_tutor (id)
);

--Sebastian
CREATE TABLE IF NOT EXISTS parameter
(
    id          INT,
    category    VARCHAR(255),
    description VARCHAR(255),
    grade       DECIMAL(5, 2),
    eval_id     INT,
    PRIMARY KEY (id),
    FOREIGN KEY (eval_id) REFERENCES eval (id)
);