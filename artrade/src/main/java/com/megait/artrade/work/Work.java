package com.megait.artrade.work;


import com.megait.artrade.action.Auction;
import com.megait.artrade.action.AuctionStatusType;
import com.megait.artrade.member.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@NoArgsConstructor @AllArgsConstructor
public class Work {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String contents;

    private String filePath;

    @ManyToOne
    private Member copyrightHolder;

    @ManyToOne
    private Member seller;

    private LocalDateTime uploadAt;

    private boolean checkToken;

    private CategoryType category;

    @OneToOne
    private Auction auction;

    private AuctionStatusType status;

    private int popularity;

    private int insert_cnt;

    private int search_cnt;

    private int comment_cnt;

    private double popularityRanking;
    @Override
    public String toString() {
        return "Work{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                ", imageUrl='" + filePath + '\'' +
                ", copyrightHolder=" + copyrightHolder +
                ", seller=" + seller +
                ", uploadAt=" + uploadAt +
                ", checkToken=" + checkToken +
                ", category=" + category +
                ", status=" + status +
                ", popularity=" + popularity +
                '}';
    }
}
