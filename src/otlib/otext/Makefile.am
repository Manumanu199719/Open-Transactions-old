noinst_LTLIBRARIES = libotext.la

## For now we build locally and statically link to this library as a convenience library

otext_headers_dir	=	$(top_srcdir)/include/otlib


otext_sources     =	mkcert.cpp			\
				anyoption.cpp			\
				tinythread.cpp			\
				Timer.cpp

otext_headers		=	$(otext_headers_dir)/anyoption.h	\
				$(otext_headers_dir)/tinythread.h	\
				$(otext_headers_dir)/Timer.h

libotext_la_SOURCES	=	$(otext_sources) $(otext_headers) $(simpleini_headers)
libotext_la_CXXFLAGS	= $(AM_CXXFLAGS) -I$(otext_headers_dir)
libotext_la_LDFLAGS	=	-static --no-undefined


pkginclude_HEADERS	=	$(otext_headers)
