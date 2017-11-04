package util;

import io.swagger.model.Channel;
import io.swagger.model.TvProgram;
import io.swagger.model.TvProgramming;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChannelUtil {

  private static List<Channel> channels = new ArrayList<>();

  public static void buildChannels() {
    Channel channel;
    TvProgramming tvProgramming;
    for (int i = 0; i < 1; i++) {
      channel = new Channel();
      channel.setChannelId("d290f1ee-6c54-4b01-90e6-d701748f085" + i);
      channel.setName("Channel " + i);
      channel.setType("Type " + i);

      tvProgramming = new TvProgramming();
      tvProgramming.setIdentification(i + "290f1ee-6c54-4b01-90e6-d701748f0851");
      tvProgramming.setName("Programming " + i);
      tvProgramming.setTvPrograms(buildPrograms());

      channel.setTvProgramming(tvProgramming);

      channels.add(channel);
    }

  }

  private static List<TvProgram> buildPrograms() {
    List<TvProgram> tvPrograms = new ArrayList<>();
    TvProgram tvProgram;
    for (int i = 0; i < 1; i++) {
      tvProgram = new TvProgram();
      tvProgram.setIdentification("d290f1ee-6c54-4b0"+i+"-90e6-d701748f0851");
      tvProgram.setName("Program " + i);
      tvProgram.setScheduleTime(new Date().toString());

      tvPrograms.add(tvProgram);
    }

    return tvPrograms;
  }

  public static List<Channel> getChannels() {
    return channels;
  }

  public static void setChannel(Channel channel) {
    channels.add(channel);
  }

  public static void removeChannel(Channel channel) {
    channels.remove(channel);
  }

}
