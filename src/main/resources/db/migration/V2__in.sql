--FRANCO
CREATE TABLE IF NOT EXISTS community_engagement (
    id          SERIAL PRIMARY KEY,
    director    VARCHAR(255) NOT NULL,
    description VARCHAR(255),
    phone       VARCHAR(15) NOT NULL,
    email       VARCHAR(255) NOT NULL UNIQUE,
    stamp       TEXT NOT NULL
    );
