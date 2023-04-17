package com.hr.model;

public enum Position {

    assistant {
        public Position getNextPosition() {
            return analyst;
        }
    },
    analyst {
        public Position getNextPosition() {
            return specialist;
        }
    },
    specialist {
        public Position getNextPosition() {
            return manager;
        }
    },
    manager {
        public Position getNextPosition() {
            return manager;
        }
    };

    public abstract Position getNextPosition();
}
