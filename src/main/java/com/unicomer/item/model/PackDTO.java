package com.unicomer.item.model;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PackDTO {

	private Object fieldOverrides;
	private List<Href> hrefs;
	private Long pallethi;
	private Long palletti;
	private Double qty;
	private String accountingentity;
	private String addwho;
	private String allowupdates;
	private String cartonizeuom1;
	private String cartonizeuom2;
	private String cartonizeuom3;
	private String cartonizeuom4;
	private String cartonizeuom8;
	private String cartonizeuom9;
	private String editwho;
	private String iswhqty1;
	private String iswhqty2;
	private String iswhqty3;
	private String iswhqty4;
	private String iswhqty5;
	private String iswhqty6;
	private String iswhqty7;
	private String iswhqty8;
	private String iswhqty9;
	@NotBlank(message = "{request.pack.packdescr.required}")
	private String packdescr;
	@NotBlank(message = "{request.pack.packkey.required}")
	private String packkey;
	@NotBlank(message = "{request.pack.packuom1.required}")
	private String packuom1;
	private String packuom2;
	@NotBlank(message = "{request.pack.packuom3.required}")
	private String packuom3;
	private String packuom4;
	private String packuom5;
	private String packuom6;
	private String packuom7;
	private String packuom8;
	private String packuom9;
	private String replenishuom1;
	private String replenishuom2;
	private String replenishuom3;
	private String replenishuom4;
	private String replenishuom8;
	private String replenishuom9;
	private String replenishzone1;
	private String replenishzone2;
	private String replenishzone3;
	private String replenishzone4;
	private String replenishzone8;
	private String replenishzone9;
	private String whseid;
	private String adddate;
	private String editdate;
	private Double casecnt;
	private Double cube;
	@NotNull(message = "{request.pack.cubeuom1.required}")
	private Double cubeuom1;
	private Double cubeuom2;
	@NotNull(message = "{request.pack.cubeuom3.required}")
	private Double cubeuom3;
	private Double cubeuom4;
	private Double grosswgt;
	@NotNull(message = "{request.pack.heightuom1.required}")
	private Double heightuom1;
	private Double heightuom2;
	@NotNull(message = "{request.pack.heightuom3.required}")
	private Double heightuom3;
	private Double heightuom4;
	private Double heightuom8;
	private Double heightuom9;
	private Double innerpack;
	@NotNull(message = "{request.pack.lengthuom1.required}")
	private Double lengthuom1;
	private Double lengthuom2;
	@NotNull(message = "{request.pack.lengthuom3.required}")
	private Double lengthuom3;
	private Double lengthuom4;
	private Double lengthuom8;
	private Double lengthuom9;
	private Double netwgt;
	private Double otherunit1;
	private Double otherunit2;
	private Double pallet;
	private Double palletwoodheight;
	private Double palletwoodlength;
	private Double palletwoodwidth;
	private Double weightuom1;
	private Double weightuom2;
	private Double weightuom3;
	private Double weightuom4;
	private Double weightuom8;
	private Double weightuom9;
	@NotNull(message = "{request.pack.widthuom1.required}")
	private Double widthuom1;
	private Double widthuom2;
	private Double widthuom3;
	private Double widthuom4;
	private Double widthuom8;
	private Double widthuom9;
	private Integer filtervalueuom1;
	private Integer filtervalueuom2;
	private Integer filtervalueuom3;
	private Integer filtervalueuom4;
	private Integer filtervalueuom5;
	private Integer filtervalueuom6;
	private Integer filtervalueuom7;
	private Integer filtervalueuom8;
	private Integer filtervalueuom9;
	private Integer indicatordigituom1;
	private Integer indicatordigituom2;
	private Integer indicatordigituom3;
	private Integer indicatordigituom4;
	private Integer indicatordigituom5;
	private Integer indicatordigituom6;
	private Integer indicatordigituom7;
	private Integer indicatordigituom8;
	private Integer indicatordigituom9;
	private Integer serialkey;
	@JsonProperty("ext_udf_str1")
	private String extUdfStr1;
	@JsonProperty("ext_udf_str2")
	private String extUdfStr2;
	@JsonProperty("ext_udf_str3")
	private String extUdfStr3;
	@JsonProperty("ext_udf_str4")
	private String extUdfStr4;
	@JsonProperty("ext_udf_str5")
	private String extUdfStr5;
	@JsonProperty("ext_udf_str6")
	private String extUdfStr6;
	@JsonProperty("ext_udf_str7")
	private String extUdfStr7;
	@JsonProperty("ext_udf_str8")
	private String extUdfStr8;
	@JsonProperty("ext_udf_str9")
	private String extUdfStr9;
	@JsonProperty("ext_udf_str10")
	private String extUdfStr10;
	@JsonProperty("ext_udf_str11")
	private String extUdfStr11;
	@JsonProperty("ext_udf_str12")
	private String extUdfStr12;
	@JsonProperty("ext_udf_str13")
	private String extUdfStr13;
	@JsonProperty("ext_udf_str14")
	private String extUdfStr14;
	@JsonProperty("ext_udf_str15")
	private String extUdfStr15;
	@JsonProperty("ext_udf_str16")
	private String extUdfStr16;
	@JsonProperty("ext_udf_str17")
	private String extUdfStr17;
	@JsonProperty("ext_udf_str18")
	private String extUdfStr18;
	@JsonProperty("ext_udf_str19")
	private String extUdfStr19;
	@JsonProperty("ext_udf_str20")
	private String extUdfStr20;
	@JsonProperty("ext_udf_date1")
	private String extUdfDate1;
	@JsonProperty("ext_udf_date2")
	private String extUdfDate2;
	@JsonProperty("ext_udf_date3")
	private String extUdfDate3;
	@JsonProperty("ext_udf_date4")
	private String extUdfDate4;
	@JsonProperty("ext_udf_date5")
	private String extUdfDate5;
	@JsonProperty("ext_udf_float1")
	private Integer extUdfFloat1;
	@JsonProperty("ext_udf_float2")
	private Integer extUdfFloat2;
	@JsonProperty("ext_udf_float3")
	private Integer extUdfFloat3;
	@JsonProperty("ext_udf_float4")
	private Integer extUdfFloat4;
	@JsonProperty("ext_udf_float5")
	private Integer extUdfFloat5;
	@JsonProperty("ext_udf_lkup1")
	private String extUdfLkup1;
	@JsonProperty("ext_udf_lkup2")
	private String extUdfLkup2;
	@JsonProperty("ext_udf_lkup3")
	private String extUdfLkupp3;
	@JsonProperty("ext_udf_lkup4")
	private String extUdfLkup4;
	@JsonProperty("ext_udf_lkup5")
	private String extUdfLkup5;
	@JsonProperty("ext_udf_lkup6")
	private String extUdfLkup6;
	@JsonProperty("ext_udf_lkup7")
	private String extUdfLkup7;
	@JsonProperty("ext_udf_lkup8")
	private String extUdfLkup8;
	@JsonProperty("ext_udf_lkup9")
	private String extUdfLkup9;
	@JsonProperty("ext_udf_lkup10")
	private String extUdfLkup10;

}
