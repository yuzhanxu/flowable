package com.github.kfcfans.powerjob.client.test;

import com.github.kfcfans.powerjob.client.OhMyClient;
import org.junit.jupiter.api.BeforeAll;

/**
 * Initialize OhMyClient
 *
 * @author tjq
 * @since 1/16/21
 */
public class ClientInitializer {

    protected static OhMyClient ohMyClient;

    @BeforeAll
    public static void initClient() throws Exception {
        ohMyClient = new OhMyClient("127.0.0.1:7700", "powerjob-agent-test", "123");
    }
}
