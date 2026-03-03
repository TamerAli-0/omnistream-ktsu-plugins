package com.omnistream.ktsu

import com.omnistream.pluginapi.plugin.OmniPlugin

/**
 * Stub base class for all OmniStream Kotatsu-powered manga plugins.
 *
 * The real implementation lives in the host app's ktsu-api module.
 * At runtime, PathClassLoader resolves KtsuPlugin from the app's classloader,
 * so the real load() logic runs — not this stub.
 *
 * Each plugin in this repo extends this with one line:
 *   class MangaDexPlugin : KtsuPlugin("MANGA_DEX")
 *
 * The sourceName must match a MangaParserSource enum entry name exactly (case-insensitive).
 */
abstract class KtsuPlugin(val sourceName: String) : OmniPlugin() {
    override val pluginName: String get() = sourceName
    override val pluginVersion: String get() = "1.0.0"
}
