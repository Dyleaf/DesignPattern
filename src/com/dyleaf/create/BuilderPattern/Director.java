package com.dyleaf.create.BuilderPattern;

public class Director {

    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }

    public Computer construct(){
        this.builder.createComputer();
        this.builder.buildCpu();
        this.builder.buildRam();
        this.builder.buildMonitor();
        return this.builder.getComputer();
    }

    /**
     * @return the builder
     */
    public Builder getBuilder() {
        return builder;
    }

    /**
     * @param builder the builder to set
     */
    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
}