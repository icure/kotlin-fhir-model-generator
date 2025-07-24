//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.testscript

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Each operation can have one or more header elements
 *
 * Header elements would be used to set HTTP headers.
 *
 * @param id Unique id for inter-element referencing
 * @param field HTTP header field name
 * @param value HTTP headerfield value
 */
@SerialName("TestScriptSetupActionOperationRequestHeader")
@Serializable
public data class TestScriptSetupActionOperationRequestHeader(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * HTTP header field name
   */
  public val `field`: String? = null,
  /**
   * HTTP headerfield value
   */
  public val `value`: String? = null,
) : BackboneElement
