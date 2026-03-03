package com.omnistream.ktsu

import com.omnistream.pluginapi.plugin.OmniPlugin
import com.omnistream.pluginapi.source.MangaSource
import com.omnistream.pluginapi.source.VideoSource

/**
 * Stub base class for all OmniStream Kotatsu-powered manga plugins.
 *
 * The real implementation lives in the host app's ktsu-api module.
 * At runtime, PathClassLoader resolves KtsuPlugin from the app's classloader,
 * so the real load() / unload() logic runs — not these stubs.
 *
 * Each plugin in this repo extends this with one line:
 *   class MangaDexPlugin : KtsuPlugin("MANGA_DEX")
 *
 * The sourceName must match a MangaParserSource enum entry name exactly (case-insensitive).
 */
abstract class KtsuPlugin(val sourceName: String) : OmniPlugin {
    override val videoSources: List<VideoSource> get() = emptyList()
    override val mangaSources: List<MangaSource> get() = emptyList()
    override fun load() {}
    override fun unload() {}
}
