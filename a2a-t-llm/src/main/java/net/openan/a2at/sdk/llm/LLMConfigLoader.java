package net.openan.a2at.sdk.llm;

import java.nio.file.Path;

/**
 * Loads LLM client configuration from `.env` files.
 *
 * @since 2026-06
 */
public final class LLMConfigLoader {

    private LLMConfigLoader() {}

    public static LLMClientConfig load(Path envPath) {
        throw new UnsupportedOperationException("LLM config loading is not implemented yet");
    }
}
