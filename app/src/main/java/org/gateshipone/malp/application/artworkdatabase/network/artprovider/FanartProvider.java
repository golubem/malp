/*
 * Copyright (C) 2016  Hendrik Borghorst
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.gateshipone.malp.application.artworkdatabase.network.artprovider;


import com.android.volley.Response;

import org.gateshipone.malp.application.artworkdatabase.network.responses.FanartFetchError;
import org.gateshipone.malp.application.artworkdatabase.network.responses.FanartResponse;
import org.gateshipone.malp.mpdservice.mpdprotocol.mpdobjects.MPDFile;

import java.util.List;

public interface FanartProvider {
    void getTrackArtistMBID(final MPDFile track, final Response.Listener<String> listener, final FanartFetchError errorListener);
    void getArtistFanartURLs(final String mbid, final Response.Listener<List<String>> listener, final FanartFetchError errorListener);
    void getFanartImage(final MPDFile track, final String url, final Response.Listener<FanartResponse> listener, final  Response.ErrorListener errorListener);
}
