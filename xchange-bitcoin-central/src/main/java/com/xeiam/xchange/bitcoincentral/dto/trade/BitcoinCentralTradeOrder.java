/*
 * Copyright (C) 2013 Matija Mazi
 * Copyright (C) 2013 Xeiam LLC http://xeiam.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.xeiam.xchange.bitcoincentral.dto.trade;

import java.math.BigDecimal;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author Matija Mazi <br/>
 * @created 1/19/13 12:49 AM
 */
public class BitcoinCentralTradeOrder {

  private final BigDecimal amount;
  private final Category category;
  private final String currency;
  private final BigDecimal ppc;
  private final Type type;

  public BitcoinCentralTradeOrder(
      @JsonProperty("amount") BigDecimal amount,
      @JsonProperty("category") Category category,
      @JsonProperty("currency") String currency,
      @JsonProperty("ppc") BigDecimal ppc,
      @JsonProperty("type") Type type
  ) {

    this.amount = amount;
    this.category = category;
    this.currency = currency;
    this.ppc = ppc;
    this.type = type;
  }

  public BigDecimal getAmount() {

    return amount;
  }

  public Category getCategory() {

    return category;
  }

  public String getCurrency() {

    return currency;
  }

  public BigDecimal getPpc() {

    return ppc;
  }

  public Type getType() {

    return type;
  }

  public static enum Type {
    limit_order
  }

  public static enum Category {
    buy, sell
  }
}