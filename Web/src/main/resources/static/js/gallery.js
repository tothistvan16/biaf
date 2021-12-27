$(document).ready(function(){
  //változók (cache):
  var hash = '',
	  help = '',
	  href = '',
	  picHref = '',
 
	  filter = $('#filter'),
	  filter_item = '',
	  photos = $('#photos'),
	  photo_list_item = '',
	  mask = '';
 
  //hash-változás feldolgozása:
  $(window).bind('hashchange',function(){
	hash = window.location.hash.substring(1);
	if (!hash || hash == '') hash = 'all';
 
	//szükséges maszkok létrehozása:
	photos.children().each(function(){
	  photo_list_item = $(this);
	  mask = $(this).find('.mask');
	  help = $(this).find('.help').html();
	  picHref = photo_list_item.find('a');
 
	  if (help !== hash && hash !== 'all'){
		mask.fadeIn(1000);
 
		//kép eltávolítása a galériából:
		picHref.attr('rel','');
	  }else{
		picHref.attr('rel','gal');
		if (mask.css('display') !== 'none') mask.fadeOut(0);
	  }
	});
 
	//szűrő módosítása:
	filter.children().each(function(){
	  filter_item = $(this);
	  href = $(this).find('a').attr('href');
 
	  if (filter_item.hasClass('active')) filter_item.removeClass('active');
 
	  if (href == '#' + hash) filter_item.addClass('active');
	});
  });
 
  $(window).trigger('hashchange');
 
  //fancybox:
  $('a.gallery').fancybox();
});