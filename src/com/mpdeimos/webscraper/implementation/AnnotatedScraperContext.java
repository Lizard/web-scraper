package com.mpdeimos.webscraper.implementation;

import com.mpdeimos.webscraper.Scrape;
import com.mpdeimos.webscraper.ScraperContext;

import java.lang.reflect.Field;

import org.jsoup.nodes.Element;

/**
 * Implementation of {@link ScraperContext} specifically aimed at
 * {@link AnnotatedScraper}.
 * 
 * @author mpdeimos
 */
public class AnnotatedScraperContext extends ScraperContext
{
	/** The scraper configuration. */
	protected Scrape configuration;

	/** Constructor. */
	protected AnnotatedScraperContext(Field field)
	{
		this.targetField = field;
		this.targetType = field.getType();
		this.configuration = field.getAnnotation(Scrape.class);
	}

	/** @return The scaper configuration. */
	public Scrape getConfiguration()
	{
		return this.configuration;
	}

	/** Sets the source element that has been selected by the CSS query. */
	public void setSourceElement(Element sourceElement)
	{
		this.sourceElement = sourceElement;
	}

	/** Sets the source data, that has been extracted from the element. */
	public void setSourceData(String sourceData)
	{
		this.sourceData = sourceData;
	}

	/** Sets the target type. */
	public void setTargetType(Class<?> targetType)
	{
		this.targetType = targetType;
	}

	/** Sets the target field. */
	public void setTargetField(Field targetField)
	{
		this.targetField = targetField;
	}
}
