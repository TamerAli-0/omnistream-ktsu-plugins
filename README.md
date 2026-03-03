# OmniStream Ktsu Plugins

Kotatsu-powered manga source plugins for [OmniStream](https://github.com/TamerAli-0).

## Add to OmniStream

1. Open OmniStream → **Settings** → **Source Manager** → **Plugins**
2. Tap **Add Repository**
3. Paste this URL:

```
https://raw.githubusercontent.com/TamerAli-0/omnistream-ktsu-plugins/main/repo.json
```

4. Browse and install any manga source you want

## Available Sources

| Plugin | Language | Source |
|--------|----------|--------|
| MangaDex | Multi | [mangadex.org](https://mangadex.org) |
| AsuraScans | EN | [asuracomic.net](https://asuracomic.net) |
| MANGA Plus | EN | [mangaplus.shueisha.co.jp](https://mangaplus.shueisha.co.jp) |
| MangaSee | EN | [mangasee123.com](https://mangasee123.com) |

## Contributing

Want to add a source? It takes one file.

1. Fork this repo
2. Copy an existing plugin folder (e.g. `plugin-mangadex`) and rename it
3. Edit `plugin.json` with the new source info
4. Edit the Kotlin file — change the class name and the source name string
5. Add your module to `settings.gradle.kts`
6. Open a PR

The source name string must match a `MangaParserSource` enum entry from [kotatsu-parsers](https://github.com/TamerAli-0/kotatsu-parsers).

## Credits

Parser implementations from [Kotatsu](https://github.com/KotatsuApp/kotatsu-parsers) (Apache 2.0).
