package voter.voter.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

    @Entity
    @Data

    public class Voter {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
            private int id;
        private String fname;
        private String lname;
        private String address;
        private String car_class;
        private String blood_group;

    }


