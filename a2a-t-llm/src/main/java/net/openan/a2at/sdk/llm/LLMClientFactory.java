package net.openan.a2at.sdk.llm;

import java.util.List;

/**
 * Registry and factory for LLM provider clients.
 *
 * @since 2026-06
 */
public final class LLMClientFactory {

    private LLMClientFactory() {}

    public static void register(String provider, Class<? extends LLMClient> clientClass) {
        throw new UnsupportedOperationException("LLM client registration is not implemented yet");
    }

    public static LLMClient create(String provider, LLMClientConfig config) {
        throw new UnsupportedOperationException("LLM client creation is not implemented yet");
    }

    public static List<String> availableProviders() {
        throw new UnsupportedOperationException("LLM provider listing is not implemented yet");
    }
}
