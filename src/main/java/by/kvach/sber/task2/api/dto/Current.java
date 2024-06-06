package by.kvach.sber.task2.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Current {

	public int last_updated_epoch;
	public String last_updated;
	public int temp_c;
	public double temp_f;
	public int is_day;
	public Condition condition;
	public double wind_mph;
	public double wind_kph;
	public int wind_degree;
	public String wind_dir;
	public int pressure_mb;
	public double pressure_in;
	public double precip_mm;
	public double precip_in;
	public int humidity;
	public int cloud;
	public double feelslike_c;
	public double feelslike_f;
	public double windchill_c;
	public double windchill_f;
	public double heatindex_c;
	public double heatindex_f;
	public double dewpoint_c;
	public double dewpoint_f;
	public int vis_km;
	public int vis_miles;
	public int uv;
	public double gust_mph;
	public double gust_kph;
}
