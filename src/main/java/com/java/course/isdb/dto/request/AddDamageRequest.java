package com.java.course.isdb.dto.request;

public record AddDamageRequest(Integer value, Boolean splash, Boolean ground, Boolean air, Integer range) {
}
