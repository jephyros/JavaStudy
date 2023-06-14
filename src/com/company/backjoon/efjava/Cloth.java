package com.company.backjoon.efjava;

/**
 * @author InSeok
 * Date : 2021-11-30
 * Remark :
 */

public class Cloth {
    private String name;
    private String type;

    public Cloth(Builder builder) {
        this.name = builder.name;
        this.type = builder.type;

    }

    @Override
    public String toString() {
        return "Cloth{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public static class Builder {
        private String name;
        private String type;


        public Builder name(String name){
            this.name= name;
            return this;

        }
        public Builder type(String type){
            this.type= type;
            return this;

        }

        public Cloth build(){
            return new Cloth(this);
        }

    }



}
