package util;

import io.swagger.model.Channel;
import io.swagger.model.Provider;
import io.swagger.model.TvProgram;
import io.swagger.model.TvProgramming;

import java.util.ArrayList;
import java.util.List;

public class ProviderUtil {

    public Provider getMockProvider(String idProvider, String nameProvider, String emailProvider) {
        Provider provider = new Provider();
        provider.id(idProvider);
        provider.setName(nameProvider);
        provider.setEmail(emailProvider);
        provider.setChannel(getMockChannel());

        return provider;
    }

    public List<Provider> getMockProviderList() {
        List<Provider> providerList = new ArrayList<>();

        providerList.add(getMockProvider("1", "HBO", "support@hbo.com"));
        providerList.add(getMockProvider("2", "FOX Premium", "support@fox.com"));

        return providerList;
    }

    public List<Provider> getMockOneProviderList(String idProvider) {
        List<Provider> providerList = new ArrayList<>();

        if (idProvider.equals("1")) {
            providerList.add(getMockProvider("1", "HBO", "support@hbo.com"));
        } else {
            providerList.add(getMockProvider("2", "FOX Premium", "support@fox.com"));
        }

        return providerList;
    }

    public void addMockProvider(Provider provider){
        
    }

    private TvProgramming getMockTvProgramming(String idTvProgramming) {
        TvProgramming tvProgramming = new TvProgramming();

        tvProgramming.setId("1");
        tvProgramming.setName("Series");
        tvProgramming.setTvPrograms(getMockTvProgram());

        return tvProgramming;
    }

    private List<TvProgram> getMockTvProgram() {
        List<TvProgram> tvProgramList = new ArrayList<>();

        TvProgram tvProgram1 = new TvProgram();
        tvProgram1.setId("1");
        tvProgram1.setName("Spartacus");
        tvProgram1.setScheduleTime("10-10-2012T08:00");
        tvProgramList.add(tvProgram1);

        TvProgram tvProgram2 = new TvProgram();
        tvProgram2.setId("2");
        tvProgram2.setName("House of Cards");
        tvProgram2.setScheduleTime("10-11-2017T22:00");
        tvProgramList.add(tvProgram2);

        return tvProgramList;
    }

    private List<Channel> getMockChannel() {
        List<Channel> channelList = new ArrayList<>();

        Channel channel1 = new Channel();
        channel1.setChannelId("1");
        channel1.setName("HBO Signature");
        channel1.setType("Familiar");
        channel1.setTvProgramming(getMockTvProgramming("1"));
        channelList.add(channel1);
        return channelList;
    }
}
