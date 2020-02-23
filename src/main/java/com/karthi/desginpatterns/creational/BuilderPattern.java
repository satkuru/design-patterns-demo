package com.karthi.desginpatterns.creational;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class BuilderPattern {
    public static void main(String[] args) {
        Trade trade = new Trade.Builder()
                .withTradeId("12345896")
                .withTradeDate(LocalDate.of(2020, Month.FEBRUARY,10))
                .withSettlementDate(LocalDate.of(2020, Month.FEBRUARY,15))
                .withCreated(LocalDateTime.now())
                .withUpdated(LocalDateTime.now())
                .withInstrumentId("US38259P5089")
                .withPrice("1285.23")
                .withPrincipal(new BigDecimal("128523.00"))
                .withVolume(100)
                .withClient("Abc Investor group")
                .withBook("FORiskBook")
                .withMarket("London")
                .build();
        System.out.println("Trade Object: "+trade);
    }

    public static class Trade {
        private String tradeId;
        private LocalDate tradeDate;
        private LocalDate settlementDate;
        private LocalDateTime created;
        private LocalDateTime updated;
        private String instrumentId;
        private String price;
        private BigDecimal principal;
        private Integer volume;
        private String client;
        private String book;
        private String market;

        public String getTradeId() {
            return tradeId;
        }

        public LocalDate getTradeDate() {
            return tradeDate;
        }

        public LocalDate getSettlementDate() {
            return settlementDate;
        }

        public LocalDateTime getCreated() {
            return created;
        }

        public LocalDateTime getUpdated() {
            return updated;
        }

        public String getInstrumentId() {
            return instrumentId;
        }

        public String getPrice() {
            return price;
        }

        public BigDecimal getPrincipal() {
            return principal;
        }

        public Integer getVolume() {
            return volume;
        }

        public String getClient() {
            return client;
        }

        public String getBook() {
            return book;
        }

        public String getMarket() {
            return market;
        }

        public Trade(String tradeId, LocalDate tradeDate, LocalDate settlementDate, LocalDateTime created, LocalDateTime updated, String instrumentId, String price, BigDecimal principal, Integer volume, String client, String book, String market) {
            this.tradeId = tradeId;
            this.tradeDate = tradeDate;
            this.settlementDate = settlementDate;
            this.created = created;
            this.updated = updated;
            this.instrumentId = instrumentId;
            this.price = price;
            this.principal = principal;
            this.volume = volume;
            this.client = client;
            this.book = book;
            this.market = market;
        }

        public static class Builder{

            private String tradeId;
            private LocalDate tradeDate;
            private LocalDate settlmentDate;
            private LocalDateTime created;
            private LocalDateTime updated;
            private String instrumentRef;
            private String price;
            private BigDecimal principal;
            private Integer volume;
            private String client;
            private String book;
            private String market;

            public Builder withTradeId(String tradeId) {
                this.tradeId = tradeId;
                return this;
            }

            public Builder withTradeDate(LocalDate tradeDate) {
                this.tradeDate = tradeDate;
                return this;
            }

            public Builder withSettlementDate(LocalDate settlmentDate) {
                this.settlmentDate = settlmentDate;
                return this;
            }

            public Builder withCreated(LocalDateTime created) {
                this.created = created;
                return this;
            }

            public Builder withUpdated(LocalDateTime updated) {
                this.updated = updated;
                return this;
            }

            public Builder withInstrumentId(String instrumentRef) {
                this.instrumentRef = instrumentRef;
                return this;
            }

            public Builder withPrice(String price) {
                this.price = price;
                return this;
            }

            public Builder withPrincipal(BigDecimal principal) {
                this.principal = principal;
                return this;
            }

            public Builder withVolume(Integer volume) {
                this.volume = volume;
                return this;
            }

            public Builder withClient(String client) {
                this.client = client;
                return this;
            }

            public Builder withBook(String book) {
                this.book = book;
                return this;
            }

            public Builder withMarket(String market) {
                this.market = market;
                return this;
            }

            public Trade build() {
                return new Trade( tradeId,tradeDate,settlmentDate,created,updated,instrumentRef,price,principal,volume,client,book,market);
            }
        }

        @Override
        public String toString() {
            return "Trade{" +
                    "tradeId='" + tradeId + '\'' +
                    ", tradeDate=" + tradeDate +
                    ", settlementDate=" + settlementDate +
                    ", created=" + created +
                    ", updated=" + updated +
                    ", instrumentId='" + instrumentId + '\'' +
                    ", price='" + price + '\'' +
                    ", principal=" + principal +
                    ", volume=" + volume +
                    ", client='" + client + '\'' +
                    ", book='" + book + '\'' +
                    ", market='" + market + '\'' +
                    '}';
        }
    }
}
