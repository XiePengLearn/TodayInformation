package com.anson.abc.http.annotation;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static com.anson.abc.http.annotation.RequestMethod.Get;
import static com.anson.abc.http.annotation.RequestMethod.Post;


/**
 * Created by anson on 2019/1/5.
 */
@Retention(RetentionPolicy.SOURCE)
@IntDef({Get,Post})
public @interface RequestMethod {
    int Get = 1;
    int Post = 2;
}
