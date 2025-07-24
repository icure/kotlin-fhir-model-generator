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
 * One or more teardown operations to perform
 *
 * The teardown action will only contain an operation.
 *
 * @param id Unique id for inter-element referencing
 * @param operation The teardown operation to perform
 */
@SerialName("TestScriptTeardownAction")
@Serializable
public data class TestScriptTeardownAction(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The teardown operation to perform
   */
  public val operation: TestScriptSetupActionOperation,
) : BackboneElement
