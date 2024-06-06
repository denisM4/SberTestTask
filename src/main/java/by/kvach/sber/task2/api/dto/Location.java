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
public class Location {

	public String name;
	public String region;
	public String country;
	public double lat;
	public double lon;
	public String tz_id;
	public int localtime_epoch;
	public String localtime;
}
