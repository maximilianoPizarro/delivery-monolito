package com.pedidosrapiadmin.app;

import com.pedidosrapiadmin.app.PedidosrapiadminApp;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = PedidosrapiadminApp.class)
public @interface IntegrationTest {
}
