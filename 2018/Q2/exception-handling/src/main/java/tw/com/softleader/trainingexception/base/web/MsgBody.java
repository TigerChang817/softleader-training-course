package tw.com.softleader.trainingexception.base.web;

import java.util.List;
import java.util.Optional;

import com.google.common.collect.Lists;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MsgBody<T> {

	private T body;
	private List<Msg> msgs;

	public boolean isMsgEmpty() {
		return Optional.ofNullable(msgs).map(List::isEmpty).orElse(true);
	}

	public MsgBody(T body, Msg... msgs) {
		this(msgs);
		this.body = body;
	}

	public MsgBody(Msg... msgs) {
		this.msgs = Lists.newArrayList(msgs);
	}

	public MsgBody(List<Msg> msgs) {
		this.msgs = msgs;
	}
}
