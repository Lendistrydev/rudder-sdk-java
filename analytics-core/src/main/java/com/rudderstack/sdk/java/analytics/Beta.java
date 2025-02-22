package com.rudderstack.sdk.java.analytics;

import static java.lang.annotation.RetentionPolicy.SOURCE;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

/**
 * Signifies that a public API (public class, method or field) is subject to incompatible changes,
 * or even removal, in a future release. An API bearing this annotation is exempt from any
 * compatibility guarantees made by its containing library. Note that the presence of this
 * annotation implies nothing about the quality or performance of the API in question, only the fact
 * that it is not "API-frozen."
 */
@Documented
@Retention(SOURCE)
public @interface Beta {}
