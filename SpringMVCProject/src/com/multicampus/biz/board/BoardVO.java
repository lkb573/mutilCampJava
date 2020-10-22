package com.multicampus.biz.board;

import java.sql.Date;

import com.multicampus.biz.common.SearchVO;

import lombok.Data;

// 1. VO(Value Object) Å¬·¡½º(= DTO)
/*@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor*/
@Data
public class BoardVO extends SearchVO {
	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private int cnt;
}











