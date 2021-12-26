package jp.mydns.kokoichi206.viper

/**
 * VIPER アーキテクチャの終点。
 */
interface Node {
    /**
     * 依存オブジェクトを取り除く。
     */
    fun onDisassemble()
}