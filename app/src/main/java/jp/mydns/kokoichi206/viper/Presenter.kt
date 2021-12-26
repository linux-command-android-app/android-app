package jp.mydns.kokoichi206.viper

/**
 * VIPER アーキテクチャのPresenterコンポーネント。
 */
interface Presenter {
    /**
     * 依存オブジェクトの結合を解除する。
     */
    fun disassembleModules()
}