package net.openan.a2at.sdk.llm.providers;

import java.util.List;
import java.util.Map;
import net.openan.a2at.sdk.llm.LLMClient;
import net.openan.a2at.sdk.llm.LLMClientConfig;
import net.openan.a2at.sdk.llm.LLMResponse;

/**
 * OpenAI-compatible LLM provider client.
 *
 * @since 2026-06
 */
public class OpenAIClient implements LLMClient {

    public OpenAIClient(LLMClientConfig config) {}

    @Override
    public LLMResponse structured(
            List<Map<String, String>> messages, Map<String, Object> jsonSchema, Double temperature, Integer maxTokens) {
        throw new UnsupportedOperationException("OpenAI structured generation is not implemented yet");
    }
}
