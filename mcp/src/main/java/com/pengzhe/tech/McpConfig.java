package com.pengzhe.tech;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.modelcontextprotocol.client.transport.HttpClientSseClientTransport;
import io.modelcontextprotocol.spec.McpClientTransport;
import org.springframework.ai.mcp.client.autoconfigure.NamedClientMcpTransport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
import java.util.List;

@Configuration
public class McpConfig {
    @Bean
    public List<NamedClientMcpTransport> mcpClientTransport() {
        McpClientTransport transport = HttpClientSseClientTransport
                .builder("https://mcp.amap.com")
                .sseEndpoint("/sse?key=3d3d3ecaa4c6d2ecaefbf93b7a18b117")
                .objectMapper(new ObjectMapper())
                .build();

        return Collections.singletonList(new NamedClientMcpTransport("amap", transport));
    }
}
