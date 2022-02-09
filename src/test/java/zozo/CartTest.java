package zozo;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

/**
 * 1. カートには購入できる上限金額を設定できる
 *     - 金額が日本円を前提とする
 * 1. カートには買いたい商品を追加できる。数量も指定できる
 *     - 商品には名前、価格、ポイント還元率(%)が含まれる
 *     - ただし、追加できる商品の数量は、0〜99個までとする
 *     - ただし、カートの上限金額を超える場合は商品を追加できない
 * 1. カートから商品を削除できる
 *     - ただし、登録されていない商品は削除できない
 * 1. カート内の商品数を変更できる
 *     - ただし、登録されていない商品の数量は変更できない
 * 1. カート内の商品内容を確認できる
 *     - 商品と商品数以外に合計金額も確認できる
 *     - 獲得できる予定のポイントを確認できる
 */
public class CartTest {

    @Nested
    public class カートには購入できる上限金額を設定できる {

    }

    @Nested
    public class カートに商品とその数量を追加する {
        @Nested
        public class 合計金額が上限を超えないとき {
            @Test
            public void カートオブジェクトにTシャツを1個追加する() {
            }
            @Test
            public void カートオブジェクトにTシャツを99個追加する() {
            }
            @Test
            public void カートオブジェクトにTシャツを100個追加する() {
            }
        }
        @Nested
        public class 合計金額が上限を超えるとき {
            @Test
            public void カートオブジェクトにTシャツを1個追加する() {
            }

            @Test
            public void カートオブジェクトにTシャツを99個追加する() {
            }
        }
    }

}
