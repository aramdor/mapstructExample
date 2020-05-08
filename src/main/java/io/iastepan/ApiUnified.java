package io.iastepan;

import lombok.Data;

@Data
public class ApiUnified {
    private String make;
    private int seatCount;
    private String type;
    private String safetySystems;


    @Override
    public String toString() {
        return "ApiUnified{" +
                "make='" + make + '\'' +
                ", seatCount=" + seatCount +
                ", type='" + type + '\'' +
                ", safetySystems='" + safetySystems + '\'' +
                '}';
    }
}
