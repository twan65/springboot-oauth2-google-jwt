package org.example.app.security.oauth2.user;

import java.util.Map;

/**
 * 認証されたユーザーの詳細を取得すると、すべてのOAuth2プロバイダーが異なるJSON応答を返します。 Spring
 * Securityは、mapキーと値のペアのジェネリックの形式で応答を解析する。
 *
 * 次のクラスはmap、キーと値のペアのジェネリックからユーザーの必要な詳細を取得するために使用される。
 */
public abstract class OAuth2UserInfo {
  protected Map<String, Object> attributes;

  public OAuth2UserInfo(Map<String, Object> attributes) {
    this.attributes = attributes;
  }

  public Map<String, Object> getAttributes() {
    return attributes;
  }

  public abstract String getId();

  public abstract String getName();

  public abstract String getEmail();

  public abstract String getImageUrl();
}
