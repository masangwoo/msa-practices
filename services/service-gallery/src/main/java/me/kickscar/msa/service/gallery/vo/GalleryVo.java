package me.kickscar.msa.service.gallery.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class GalleryVo {
	private Long no;
	private String url;
	private String comments;
}